package com.googlecode.canoe.fcgi.constant;

/**
 *
 * @author panzd
 */
public enum FCGIHeaderType {
    FCGI_BEGIN_REQUEST {
        @Override
        public int getId()
        {
            return 1;
        }
    },
    FCGI_ABORT_REQUEST {
        @Override
        public int getId()
        {
            return 2;
        }
    },
    FCGI_END_REQUEST {
        @Override
        public int getId()
        {
            return 3;
        }
    },
    FCGI_PARAMS {
        @Override
        public int getId()
        {
            return 4;
        }
    },
    FCGI_STDIN {
        @Override
        public int getId()
        {
            return 5;
        }
    },
    FCGI_STDOUT {
        @Override
        public int getId()
        {
            return 6;
        }
    },
    FCGI_STDERR {
        @Override
        public int getId()
        {
            return 7;
        }
    },
    FCGI_DATA {
        @Override
        public int getId()
        {
            return 8;
        }
    },
    FCGI_GET_VALUES {
        @Override
        public int getId()
        {
            return 9;
        }
    },
    FCGI_GET_VALUES_RESULT {
        @Override
        public int getId()
        {
            return 10;
        }
    },
    FCGI_UNKNOWN_TYPE {
        @Override
        public int getId()
        {
            return 11;
        }
    };

    public abstract int getId();
    private static final FCGIHeaderType[] typeMap;
    static {
        typeMap = new FCGIHeaderType[12];
        for(FCGIHeaderType type : values())
        {
            typeMap[type.getId()] = type;
        }
    }

    public static FCGIHeaderType valueOf(int id)
    {
        return typeMap[id];
    }
}
